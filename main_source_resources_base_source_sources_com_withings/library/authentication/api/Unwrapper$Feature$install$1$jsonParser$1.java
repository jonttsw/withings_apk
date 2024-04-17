package com.withings.library.authentication.api;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.serialization.json.JsonBuilder;
import nm0.y;
import ym0.l;
/* compiled from: Unwrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "Lnm0/y;", "invoke", "(Lkotlinx/serialization/json/JsonBuilder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class Unwrapper$Feature$install$1$jsonParser$1 extends w implements l<JsonBuilder, y> {
    public static final Unwrapper$Feature$install$1$jsonParser$1 INSTANCE = new Unwrapper$Feature$install$1$jsonParser$1();

    Unwrapper$Feature$install$1$jsonParser$1() {
        super(1);
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(JsonBuilder jsonBuilder) {
        invoke2(jsonBuilder);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JsonBuilder Json) {
        u.j(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setExplicitNulls(false);
    }
}
