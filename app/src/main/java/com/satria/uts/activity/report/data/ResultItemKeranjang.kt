package com.satria.uts.activity.report.detail.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import com.satria.uts.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultItemKeranjang(

	@field:SerializedName("keranjang")
	val keranjang: Keranjang? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)