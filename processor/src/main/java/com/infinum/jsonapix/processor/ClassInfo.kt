package com.infinum.jsonapix.processor

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock

internal data class ClassInfo(
    val type: String,
    val jsonWrapperClassName: ClassName,
    val jsonWrapperListClassName: ClassName,
    val resourceObjectClassName: ClassName,
    val attributesWrapperClassName: ClassName?,
    val relationshipsObjectClassName: ClassName?,
    val includedStatement: CodeBlock?,
    val includedListStatement: CodeBlock?
)
