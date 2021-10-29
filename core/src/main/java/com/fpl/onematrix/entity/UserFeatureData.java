package com.fpl.onematrix.entity;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Getter
@RequiredArgsConstructor
@Table(
		uniqueConstraints = {
				@UniqueConstraint(name = "customer_feature", columnNames = {"customer_no", "feature_id"})
		},
		indexes = {
				@Index(name = "customer_feature_idx", columnList = "customer_no,feature_id", unique = true)
		}
)
public class UserFeatureData {

	@Id
	private Long id;

	//	@Column(name = "feature_id")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "feature_id", nullable = false)
	private FeatureMaster feature;

	@Column(name = "customer_no")
	private String customerNumber;// Long/UUID ?

	private String value;

	private Instant validTill;// varchar / text ?

}
