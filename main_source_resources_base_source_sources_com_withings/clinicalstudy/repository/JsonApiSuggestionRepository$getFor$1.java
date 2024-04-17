package com.withings.clinicalstudy.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonApiSuggestionRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.clinicalstudy.repository.JsonApiSuggestionRepository", f = "JsonApiSuggestionRepository.kt", l = {21, 23}, m = "getFor")
/* loaded from: classes3.dex */
public final class JsonApiSuggestionRepository$getFor$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonApiSuggestionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonApiSuggestionRepository$getFor$1(JsonApiSuggestionRepository jsonApiSuggestionRepository, d<? super JsonApiSuggestionRepository$getFor$1> dVar) {
        super(dVar);
        this.this$0 = jsonApiSuggestionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFor(0, null, this);
    }
}
