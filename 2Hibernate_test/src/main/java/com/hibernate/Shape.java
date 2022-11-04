/*
 *  2.create a class Shape  (10 marks)
   shapeId  INT NOT NULL AUTO_INCREMENT primary key
   
create two subclasses
  a. Rectangle
         length INT NOT NULL,
         breadth  INT NOT NULL  

  b.Circle
       radius  INT NOT NULL
 Use (@inheritence(inheritanceType.SingleTable) per hierarchy.
 insert 1 record in each entity.
 */

package com.hibernate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name="SHAPE")
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="shape" ,discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("SHAPE")
public class Shape
{
	@Id
	@GeneratedValue
	private int shapeId;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(int shapeId) {
		super();
		this.shapeId = shapeId;
	}

	public int getShapeId() {
		return shapeId;
	}

	public void setShapeId(int shapeId) {
		this.shapeId = shapeId;
	}

	@Override
	public String toString() {
		return "Shape [shapeId=" + shapeId + ", toString()=" + super.toString() + "]";
	}
	
	
}
