package com.fpl.onematrix.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Getter
@RequiredArgsConstructor
@Cacheable
public class UsecaseFeatureMap {

	@Id
	private Long id;

	@Column(name = "usecase_name")
	private String usecaseName;


	@OneToOne
	private FeatureMaster featureId;

	private boolean mandatory;

	private String checkpointName;// varchar / text ?

}
