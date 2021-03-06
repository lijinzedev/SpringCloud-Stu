package com.stu.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: Curiosity
 * @Date: 2021/1/16 22:42
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
