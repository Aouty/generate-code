package com.dibag.code.entity;

/**
 * 字段信息类
 * @author quan
 *
 */
public class TableField {

	/**
	 * 表字段名称
	 */
	private String columnName;

	/**
	 * 表字段类型
	 */
	private String columnType;

	/**
	 * 表注释
	 */
	private String comment;

	/**
	 * 实体类的字段类型
	 */
	private String entityField;

	/**
	 * 实体类的字段类型
	 */
	private String entityType;

	/**
	 * 是否是主键
	 */
	private boolean PK;

	/**
	 * 实体类字段的首字母大写
	 */
	private String entityFieldFirst;

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName( String columnName ) {
		this.columnName = columnName;
	}

	public String getColumnType() {
		return columnType;
	}

	public void setColumnType( String columnType ) {
		this.columnType = columnType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment( String comment ) {
		this.comment = comment == null || comment.isEmpty() ? " " : comment;
	}

	public String getEntityField() {
		return entityField;
	}

	public void setEntityField( String entityField ) {
		this.entityField = entityField;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType( String entityType ) {
		this.entityType = entityType;
	}

	public boolean isPK() {
		return PK;
	}

	public void setPK( boolean pK ) {
		PK = pK;
	}

	public String getEntityFieldFirst() {
		return entityFieldFirst;
	}

	public void setEntityFieldFirst( String entityFieldFirst ) {
		this.entityFieldFirst = entityFieldFirst;
	}

}
