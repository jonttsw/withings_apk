package com.withings.manualLogging.data.webservice.healthAttribute;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthAttributeWebServiceMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeWebServiceMapper", f = "HealthAttributeWebServiceMapper.kt", l = {14}, m = "toRoomHealthAttribute")
/* loaded from: classes4.dex */
public final class HealthAttributeWebServiceMapper$toRoomHealthAttribute$1 extends c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthAttributeWebServiceMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthAttributeWebServiceMapper$toRoomHealthAttribute$1(HealthAttributeWebServiceMapper healthAttributeWebServiceMapper, d<? super HealthAttributeWebServiceMapper$toRoomHealthAttribute$1> dVar) {
        super(dVar);
        this.this$0 = healthAttributeWebServiceMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toRoomHealthAttribute(null, 0L, this);
    }
}
