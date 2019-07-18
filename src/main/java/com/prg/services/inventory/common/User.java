package com.prg.services.inventory.common;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("unused")
public class User implements Serializable {

	
	private String id;
	private String firstName;
	private String lastName;

}
