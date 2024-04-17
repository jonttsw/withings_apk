package com.withings.wiscale2.activity.model.builder;

import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RecomputeAggregate.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.model.builder.RecomputeAggregate", f = "RecomputeAggregate.kt", l = {ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT, 218}, m = "buildAggregateForDay")
/* loaded from: classes4.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Object f48507a;

    /* renamed from: b  reason: collision with root package name */
    Object f48508b;

    /* renamed from: c  reason: collision with root package name */
    Object f48509c;

    /* renamed from: d  reason: collision with root package name */
    Object f48510d;

    /* renamed from: e  reason: collision with root package name */
    ActivityAggregate f48511e;

    /* renamed from: f  reason: collision with root package name */
    DateTime f48512f;

    /* renamed from: g  reason: collision with root package name */
    DateTime f48513g;

    /* renamed from: h  reason: collision with root package name */
    ActivityAggregate f48514h;

    /* renamed from: i  reason: collision with root package name */
    List f48515i;

    /* renamed from: j  reason: collision with root package name */
    ArrayList f48516j;

    /* renamed from: k  reason: collision with root package name */
    /* synthetic */ Object f48517k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ RecomputeAggregate f48518l;

    /* renamed from: m  reason: collision with root package name */
    int f48519m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecomputeAggregate recomputeAggregate, qm0.d<? super c> dVar) {
        super(dVar);
        this.f48518l = recomputeAggregate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable v11;
        this.f48517k = obj;
        this.f48519m |= Integer.MIN_VALUE;
        v11 = this.f48518l.v(null, null, this);
        return v11;
    }
}
