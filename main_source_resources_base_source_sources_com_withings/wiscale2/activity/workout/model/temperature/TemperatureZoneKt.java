package com.withings.wiscale2.activity.workout.model.temperature;

import bt.a;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.graph.model.NormalityZoneUiModel;
import en0.i;
import en0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import l70.j;
import l70.u;
import org.joda.time.DateTime;
import ws.d;
/* compiled from: TemperatureZone.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZone;", "", "accuracy", "Ll70/u;", HealthConstants.FoodIntake.UNIT, "Len0/k;", "getRange", "(Lcom/withings/wiscale2/activity/workout/model/temperature/TemperatureZone;ILl70/u;)Len0/k;", "", "", "initialTemperature", "Lcom/withings/graph/model/NormalityZoneUiModel;", "getWarningZone", "(Ljava/util/List;Ll70/u;D)Ljava/util/List;", "", "value", "getTemperatureByUnit", "(Ll70/u;F)F", "HealthMate_prodRelease"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TemperatureZoneKt {
    /* JADX WARN: Type inference failed for: r0v2, types: [en0.i, en0.k] */
    public static final k getRange(TemperatureZone temperatureZone, int i11, u unit) {
        kotlin.jvm.internal.u.j(temperatureZone, "<this>");
        kotlin.jvm.internal.u.j(unit, "unit");
        float f11 = i11;
        return new i((int) (getTemperatureByUnit(unit, temperatureZone.getMinValue()) * f11), (int) (getTemperatureByUnit(unit, temperatureZone.getMaxValue()) * f11), 1);
    }

    public static final float getTemperatureByUnit(u unit, float f11) {
        kotlin.jvm.internal.u.j(unit, "unit");
        if (unit instanceof j) {
            int i11 = j.f78807c;
            return (float) j.a.a(f11);
        }
        return f11;
    }

    public static final List<NormalityZoneUiModel> getWarningZone(List<TemperatureZone> list, u unit, double d11) {
        kotlin.jvm.internal.u.j(list, "<this>");
        kotlin.jvm.internal.u.j(unit, "unit");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TemperatureZone) obj).getType() == TemperatureZonesType.OVERHEATING) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TemperatureZone temperatureZone = (TemperatureZone) it.next();
            float temperatureByUnit = getTemperatureByUnit(unit, temperatureZone.getMinValue());
            float temperatureByUnit2 = getTemperatureByUnit(unit, temperatureZone.getMaxValue());
            double d12 = temperatureByUnit - d11;
            double d13 = temperatureByUnit2 - d11;
            arrayList2.add(new NormalityZoneUiModel(NormalityZoneUiModel.Status.f39969b, x.W(new d(1, a.a(), d12, d13), new d(1, DateTime.now().plusYears(1).withDayOfYear(1).plusDays(72), d12, d13)), NormalityZoneUiModel.Type.f39971a));
        }
        return arrayList2;
    }
}
