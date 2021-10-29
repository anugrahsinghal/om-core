package com.fpl.onematrix.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Getter
@RequiredArgsConstructor
public class FeatureMaster {

	@Id
	private Long id;

	private String featureName;

	private String source;// varchar / text ?

}
