package com.openDC.loclookup.model.vo;

import com.openDC.loclookup.model.ListItemTypes;

import org.zakariya.stickyheaders.ListItem;

public class MapItem extends ListItem {
    public String mapName;
    public boolean isChecked;

    public MapItem(String mapName) {
        this.mapName = mapName;
        listItemType = ListItemTypes.MAP_ITEM;
    }
}