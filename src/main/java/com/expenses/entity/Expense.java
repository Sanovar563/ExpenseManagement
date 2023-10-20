package com.expenses.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "expenses")

public class Expense {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

	 @NotBlank(message = "Description is required")
	    private String description;

	    @NotNull(message = "Amount is required")
	    @Positive(message = "Amount must be a positive value")
	    private Double amount;

	    @NotBlank(message = "Category is required")
	    private String category;
	    @Lob
	    @Basic(fetch = FetchType.LAZY)
	    @Column(nullable = false)
	    private byte[] pdfData;
}