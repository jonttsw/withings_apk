package com.withings.measure.detail.ui.screen;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.withings.periodsbar.Period;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MeasureDetailScreen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/withings/measure/detail/ui/screen/MeasureDetailScreen;", "MeasureDataType", "Landroid/os/Parcelable;", "Lpy/a;", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MeasureDetailScreen<MeasureDataType> extends Parcelable, py.a {
    String C2(Context context, ky.d dVar, jm.a aVar);

    void E0(List<ky.d> list, oy.d dVar);

    ym0.l<Iterable<? extends MeasureDataType>, MeasureDataType> I0();

    int b0();

    int getMeasureType();

    List<Period> getPeriodList();

    a h3(oy.d dVar);

    default boolean l3() {
        return false;
    }

    void s0();

    Intent v0(Context context);
}
