package com.withings.environment.data;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.measure.Measure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.ReadablePeriod;
/* loaded from: classes3.dex */
public final class DataAggregator {

    /* renamed from: a  reason: collision with root package name */
    private List<Measure> f38865a;

    /* renamed from: b  reason: collision with root package name */
    private DateTime f38866b;

    /* renamed from: c  reason: collision with root package name */
    private DateTime f38867c;

    /* renamed from: d  reason: collision with root package name */
    private ReadablePeriod f38868d;

    /* renamed from: e  reason: collision with root package name */
    private Type f38869e;

    /* renamed from: f  reason: collision with root package name */
    private double f38870f = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* renamed from: g  reason: collision with root package name */
    private double f38871g = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* renamed from: h  reason: collision with root package name */
    private double f38872h = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class TimeSpan {

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ TimeSpan[] f38873a = {new Enum("SECOND", 0), new Enum("MINUTE", 1), new Enum("DAY", 2), new Enum("WEEK", 3), new Enum("MONTH", 4), new Enum("YEAR", 5)};
        /* JADX INFO: Fake field, exist only in values array */
        TimeSpan EF5;

        private TimeSpan() {
            throw null;
        }

        public static TimeSpan valueOf(String str) {
            return (TimeSpan) Enum.valueOf(TimeSpan.class, str);
        }

        public static TimeSpan[] values() {
            return (TimeSpan[]) f38873a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Type {

        /* renamed from: a  reason: collision with root package name */
        public static final Type f38874a;

        /* renamed from: b  reason: collision with root package name */
        private static final /* synthetic */ Type[] f38875b;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.environment.data.DataAggregator$Type] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.environment.data.DataAggregator$Type] */
        static {
            ?? r02 = new Enum("MEAN", 0);
            f38874a = r02;
            f38875b = new Type[]{r02, new Enum("SUM", 1)};
        }

        private Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f38875b.clone();
        }
    }

    /* loaded from: classes3.dex */
    private static class a implements Comparator<Measure> {
        @Override // java.util.Comparator
        public final int compare(Measure measure, Measure measure2) {
            return Double.compare(measure.f95793x, measure2.f95793x);
        }
    }

    private Measure b(DateTime dateTime, int i11) {
        Measure measure = new Measure(dateTime.getMillis(), this.f38871g);
        if (this.f38869e == Type.f38874a) {
            measure.f95794y = this.f38871g / this.f38872h;
        }
        measure.setType(i11);
        return measure;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Comparator] */
    public final tq.a a() {
        DateTime dateTime;
        int binarySearch;
        DateTime dateTime2;
        int binarySearch2;
        int i11;
        ArrayList arrayList;
        int i12;
        long j5;
        int i13;
        DateTime dateTime3;
        ArrayList arrayList2 = new ArrayList();
        if (this.f38866b == null) {
            binarySearch = 0;
        } else {
            binarySearch = Collections.binarySearch(this.f38865a, new Measure(dateTime.getMillis(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), new Object());
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
        }
        if (this.f38867c == null) {
            binarySearch2 = this.f38865a.size() - 1;
        } else {
            binarySearch2 = Collections.binarySearch(this.f38865a, new Measure(dateTime2.getMillis(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), new Object());
            if (binarySearch2 < 0) {
                binarySearch2 = (-binarySearch2) - 2;
            }
        }
        if (binarySearch == this.f38865a.size()) {
            return tq.a.f100521e;
        }
        if (this.f38868d == null) {
            return new tq.a(this.f38865a.subList(binarySearch, binarySearch2 + 1));
        }
        int type = this.f38865a.get(0).getType();
        DateTime dateTime4 = this.f38866b;
        if (dateTime4 == null) {
            dateTime4 = new DateTime(Double.valueOf(this.f38865a.get(binarySearch).f95793x));
        }
        DateTime withPeriodAdded = dateTime4.withPeriodAdded(this.f38868d, 1);
        double d11 = this.f38865a.get(binarySearch).f95794y;
        int i14 = binarySearch;
        DateTime dateTime5 = dateTime4;
        DateTime dateTime6 = withPeriodAdded;
        double d12 = d11;
        while (i14 <= binarySearch2) {
            Measure measure = this.f38865a.get(i14);
            int i15 = type;
            if (measure.f95793x >= dateTime6.getMillis()) {
                if (this.f38872h > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    i12 = i15;
                    arrayList2.add(b(dateTime5, i12));
                } else {
                    i12 = i15;
                }
                this.f38871g = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                this.f38872h = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                DateTime withPeriodAdded2 = dateTime6.withPeriodAdded(this.f38868d, 1);
                while (true) {
                    dateTime3 = dateTime6;
                    dateTime6 = withPeriodAdded2;
                    if (!dateTime6.isBefore((long) measure.f95793x)) {
                        break;
                    }
                    Measure measure2 = new Measure(dateTime3.getMillis(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    measure2.setType(measure.getType());
                    this.f38865a.add(measure2);
                    withPeriodAdded2 = dateTime6.withPeriodAdded(this.f38868d, 1);
                    binarySearch2 = binarySearch2;
                    arrayList2 = arrayList2;
                    binarySearch = binarySearch;
                }
                i11 = binarySearch;
                arrayList = arrayList2;
                i13 = binarySearch2;
                j5 = 0;
                dateTime5 = dateTime3;
                dateTime6 = dateTime3.withPeriodAdded(this.f38868d, 1);
            } else {
                i11 = binarySearch;
                arrayList = arrayList2;
                i12 = i15;
                j5 = 0;
                i13 = binarySearch2;
            }
            double d13 = this.f38870f;
            double d14 = measure.f95794y;
            this.f38870f = d13 + d14;
            d11 = Math.min(d11, d14);
            d12 = Math.max(d12, measure.f95794y);
            this.f38871g += measure.f95794y;
            this.f38872h += 1.0d;
            i14++;
            type = i12;
            binarySearch2 = i13;
            arrayList2 = arrayList;
            binarySearch = i11;
        }
        arrayList2.add(b(dateTime5, type));
        return new tq.a(arrayList2, d11, d12, this.f38870f / ((binarySearch2 - binarySearch) + 1));
    }

    public final void c(DateTime dateTime) {
        this.f38867c = dateTime;
    }

    public final void d(ArrayList arrayList) {
        this.f38865a = arrayList;
    }

    public final void e(Minutes minutes) {
        this.f38868d = minutes;
    }

    public final void f(DateTime dateTime) {
        this.f38866b = dateTime;
    }

    public final void g() {
        this.f38869e = Type.f38874a;
    }
}
