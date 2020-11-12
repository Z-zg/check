package com.goxda.check.api.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ElectronicDocumentsEncapsulationPackage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 格式描述
     */
    private String formatDescription;

    /**
     * 版本
     */
    private String version;


}
