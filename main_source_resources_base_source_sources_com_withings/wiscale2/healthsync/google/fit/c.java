package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: GoogleFitMapping.kt */
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: GoogleFitMapping.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f56439a;

        static {
            int[] iArr = new int[Vasistas.Category.values().length];
            try {
                iArr[Vasistas.Category.SPO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f56439a = iArr;
        }
    }

    /* compiled from: GoogleFitMapping.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.l<DataSet, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataType f56440a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DataType dataType) {
            super(1);
            this.f56440a = dataType;
        }

        @Override // ym0.l
        public final Boolean invoke(DataSet dataSet) {
            DataSet it = dataSet;
            u.j(it, "it");
            return Boolean.valueOf(u.e(it.getDataType(), this.f56440a));
        }
    }

    /* compiled from: GoogleFitMapping.kt */
    /* renamed from: com.withings.wiscale2.healthsync.google.fit.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0739c extends w implements ym0.l<DataSet, List<DataPoint>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0739c f56441a = new w(1);

        @Override // ym0.l
        public final List<DataPoint> invoke(DataSet dataSet) {
            DataSet it = dataSet;
            u.j(it, "it");
            List<DataPoint> dataPoints = it.getDataPoints();
            u.i(dataPoints, "getDataPoints(...)");
            return dataPoints;
        }
    }

    public static final List<DataPoint> a(List<DataSet> list, DataType dataType) {
        u.j(dataType, "dataType");
        return cp0.n.A(cp0.n.i(cp0.n.i(cp0.n.m(cp0.n.h(x.t(list), new b(dataType)), C0739c.f56441a), d.f56442a), e.f56443a));
    }

    public static final SleepLevel b(DataPoint dataPoint) {
        u.j(dataPoint, "<this>");
        switch (dataPoint.getValue(Field.FIELD_SLEEP_SEGMENT_TYPE).asInt()) {
            case 1:
            case 3:
                return SleepLevel.Awake;
            case 2:
                return SleepLevel.Unspecified;
            case 4:
                return SleepLevel.Light;
            case 5:
                return SleepLevel.Deep;
            case 6:
                return SleepLevel.Rem;
            default:
                return null;
        }
    }
}
