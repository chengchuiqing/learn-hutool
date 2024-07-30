package com.qing.tree;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import com.qing.tree.domain.SysResource;

import java.util.List;

/**
 * 参考：
 *  https://www.cnblogs.com/wuyuegb2312/p/9068574.html
 *  https://www.cnblogs.com/zys2019/p/16836192.html
 */
public class TreeDemo03 {

    public static void main(String[] args) {
        //配置
        TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
        // 自定义属性名
        treeNodeConfig.setWeightKey("order"); // 权重排序字段 默认为weight
        treeNodeConfig.setIdKey("id"); // 默认为id可以不设置
        treeNodeConfig.setNameKey("title"); // 节点名对应名称 默认为name
        treeNodeConfig.setParentIdKey("parentId"); // 父节点 默认为parentId
        treeNodeConfig.setChildrenKey("children"); // 子点 默认为children
        treeNodeConfig.setDeep(3); // 可以配置递归深度 从0开始计算 默认此配置为空,即不限制

        // 获取所有资源
        List<SysResource> resources = list();

        // 构建树
        List<Tree<Long>> treeList = TreeUtil.build(resources, 0L, treeNodeConfig, (resource, tree) -> {
            // 其中id和parentId是必须设置的，否则会报错
            tree.setId(resource.getId());
            tree.setParentId(resource.getParentId());
            tree.setName(resource.getTitle());
            tree.setWeight(resource.getResSort());

            // 设置其他要显示的字段
            tree.putExtra("type", resource.getType());
            tree.putExtra("permission", resource.getPermission());
            tree.putExtra("routePath", resource.getRoutePath());
            tree.putExtra("icon", resource.getIcon());
        });
    }

    private static List<SysResource> list() {
        // 模拟数据，实际开发中是从数据库查询出来的
        // 把所有要组合成树型结构的对象放到一个list中即可
        return null;
    }

}
