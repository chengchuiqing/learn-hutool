package com.qing.tree;


import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.json.JSONUtil;
import com.qing.tree.domain.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeDemo02 {

    public static void main(String[] args) {
        //配置
        TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
        // 自定义属性名
        treeNodeConfig.setWeightKey("order"); // 权重排序字段 默认为weight
        treeNodeConfig.setIdKey("id"); // 默认为id可以不设置
        treeNodeConfig.setNameKey("name"); // 节点名对应名称 默认为name
        treeNodeConfig.setParentIdKey("parentId"); // 父节点 默认为parentId
        treeNodeConfig.setChildrenKey("children"); // 子点 默认为children
        treeNodeConfig.setDeep(3); // 可以配置递归深度 从0开始计算 默认此配置为空,即不限制

        //数据源
        List<Student> nodeList = list();
        //转换器 "0" - 最顶层父id值 一般为0之类  nodeList – 源数据集合
        List<Tree<String>> treeNodes = TreeUtil.build(nodeList, "0", treeNodeConfig,
                // treeNode – 源数据实体
                // tree – 树节点实体
                (treeNode, tree) -> {
                    tree.setId(treeNode.getId());
                    tree.setParentId(treeNode.getParentId());
                    tree.setWeight(treeNode.getWeight());
                    tree.setName(treeNode.getName());
                    // 扩展属性 ...
                    tree.putExtra("extraField", 666);
                    tree.putExtra("other", new Object());
                }
        );

        System.out.println(JSONUtil.toJsonPrettyStr(treeNodes));

        // 这时如果数据排序方式不对（顺序 、倒序）问题时  可以使用Collections.reverse() 方法来将数据进行翻转
        Collections.reverse(treeNodes);
        System.out.println("--------- 反转后 ---------");
        System.out.println(JSONUtil.toJsonPrettyStr(treeNodes));
    }

    private static List<Student> list() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1", "0", 3, "张三"));
        list.add(new Student("2", "0", 4, "李四"));
        list.add(new Student("3", "1", 5, "王五"));
        list.add(new Student("4", "1", 6, "赵六"));
        list.add(new Student("5", "2", 7, "孙七"));
        return list;
    }
}
