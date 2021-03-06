package com.wade.wet.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {

    private String name;

    private String description;

    private List<WotProperty> properties;

    private List<WotAction> actions;

    private List<WotEvent> events;

}
