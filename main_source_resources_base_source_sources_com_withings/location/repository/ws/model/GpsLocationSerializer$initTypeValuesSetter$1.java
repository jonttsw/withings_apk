package com.withings.location.repository.ws.model;

import com.withings.location.model.GpsLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: GpsLocationSerializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/location/model/GpsLocation;", "invoke", "(Lcom/withings/location/model/GpsLocation;)Ljava/lang/Double;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class GpsLocationSerializer$initTypeValuesSetter$1 extends w implements l<GpsLocation, Double> {
    public static final GpsLocationSerializer$initTypeValuesSetter$1 INSTANCE = new GpsLocationSerializer$initTypeValuesSetter$1();

    GpsLocationSerializer$initTypeValuesSetter$1() {
        super(1);
    }

    @Override // ym0.l
    public final Double invoke(GpsLocation it) {
        double reduceDecimal;
        u.j(it, "it");
        reduceDecimal = GpsLocationSerializerKt.reduceDecimal(it.getSpeed());
        return Double.valueOf(reduceDecimal);
    }
}
