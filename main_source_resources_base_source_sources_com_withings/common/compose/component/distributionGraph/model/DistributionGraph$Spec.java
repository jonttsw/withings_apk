package com.withings.common.compose.component.distributionGraph.model;

import androidx.compose.material.o;
import en0.r;
import java.util.Iterator;
import java.util.List;
import k3.h;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import sm0.b;
import ym0.q;
/* compiled from: DistributionGraph.kt */
/* loaded from: classes3.dex */
public final class DistributionGraph$Spec {

    /* renamed from: a  reason: collision with root package name */
    private final List<zj.a> f33716a;

    /* renamed from: b  reason: collision with root package name */
    private final float f33717b;

    /* renamed from: c  reason: collision with root package name */
    private final Form f33718c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33719d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DistributionGraph.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/distributionGraph/model/DistributionGraph$Spec$Form;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Form {

        /* renamed from: b  reason: collision with root package name */
        public static final Form f33720b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ Form[] f33721c;

        /* renamed from: a  reason: collision with root package name */
        private final q<DistributionGraph$Spec, Integer, Float, Float> f33722a;

        /* compiled from: DistributionGraph.kt */
        /* loaded from: classes3.dex */
        static final class a extends w implements q<DistributionGraph$Spec, Integer, Float, Float> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f33723a = new w(3);

            @Override // ym0.q
            public final Float invoke(DistributionGraph$Spec distributionGraph$Spec, Integer num, Float f11) {
                DistributionGraph$Spec distributionGraph$Spec2 = distributionGraph$Spec;
                int intValue = num.intValue();
                float floatValue = f11.floatValue();
                u.j(distributionGraph$Spec2, "$this$null");
                return Float.valueOf((1 - ((float) Math.cos((((intValue + 1) * 2) * 3.141592653589793d) / (distributionGraph$Spec2.d() + 1)))) * floatValue * 0.5f);
            }
        }

        static {
            Form form = new Form(a.f33723a);
            f33720b = form;
            Form[] formArr = {form};
            f33721c = formArr;
            b.a(formArr);
        }

        private Form(q qVar) {
            this.f33722a = qVar;
        }

        public static Form valueOf(String str) {
            return (Form) Enum.valueOf(Form.class, str);
        }

        public static Form[] values() {
            return (Form[]) f33721c.clone();
        }

        public final q<DistributionGraph$Spec, Integer, Float, Float> a() {
            return this.f33722a;
        }
    }

    /* compiled from: DistributionGraph.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static DistributionGraph$Spec a(double d11, String rangeLowestMinFormatted, double d12, String rangeLowMinFormatted, double d13, String rangeMiddleMinFormatted, double d14, String rangeHighMinFormatted, double d15, String rangeHighestMinFormatted, double d16, String rangeHighestMaxFormatted, long j5, long j11, long j12, long j13, long j14, int i11, int i12, int i13, int i14, int i15) {
            u.j(rangeLowestMinFormatted, "rangeLowestMinFormatted");
            u.j(rangeLowMinFormatted, "rangeLowMinFormatted");
            u.j(rangeMiddleMinFormatted, "rangeMiddleMinFormatted");
            u.j(rangeHighMinFormatted, "rangeHighMinFormatted");
            u.j(rangeHighestMinFormatted, "rangeHighestMinFormatted");
            u.j(rangeHighestMaxFormatted, "rangeHighestMaxFormatted");
            if (d11 < d12) {
                if (d12 < d13) {
                    if (d13 < d14) {
                        if (d14 < d15) {
                            if (d15 < d16) {
                                return new DistributionGraph$Spec(x.W(new zj.a(r.o(d11, d12), new j(rangeLowestMinFormatted, rangeLowMinFormatted), i11, j5), new zj.a(r.o(d12, d13), new j(rangeLowMinFormatted, rangeMiddleMinFormatted), i12, j11), new zj.a(r.o(d13, d14), new j(rangeMiddleMinFormatted, rangeHighMinFormatted), i13, j12), new zj.a(r.o(d14, d15), new j(rangeHighMinFormatted, rangeHighestMinFormatted), i14, j13), new zj.a(r.o(d15, d16), new j(rangeHighestMinFormatted, rangeHighestMaxFormatted), i15, j14)), 50);
                            }
                            throw new IllegalStateException("Bad value");
                        }
                        throw new IllegalStateException("Bad value");
                    }
                    throw new IllegalStateException("Bad value");
                }
                throw new IllegalStateException("Bad value");
            }
            throw new IllegalStateException("Bad value");
        }
    }

    private DistributionGraph$Spec() {
        throw null;
    }

    public DistributionGraph$Spec(List list, float f11) {
        Form form = Form.f33720b;
        this.f33716a = list;
        this.f33717b = f11;
        this.f33718c = form;
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((zj.a) it.next()).f();
        }
        this.f33719d = i11;
    }

    public final long a(int i11) {
        List<zj.a> list;
        int i12 = 0;
        while (true) {
            list = this.f33716a;
            int i13 = i12 + 1;
            int i14 = 0;
            for (zj.a aVar : x.H0(list, i13)) {
                i14 += aVar.f();
            }
            if (i11 < i14 || i12 >= list.size()) {
                break;
            }
            i12 = i13;
        }
        return list.get(i12).b();
    }

    public final int b(double d11) {
        List<zj.a> list = this.f33716a;
        double h11 = r.h(d11, ((zj.a) x.I(list)).getStart().doubleValue(), ((zj.a) x.T(list)).j().doubleValue());
        Iterator<zj.a> it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().a(h11)) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 != -1) {
            zj.a aVar = list.get(i12);
            int f11 = h11 >= aVar.j().doubleValue() ? aVar.f() - 1 : (int) Math.floor(((h11 - aVar.getStart().doubleValue()) * aVar.f()) / (aVar.j().doubleValue() - aVar.getStart().doubleValue()));
            for (zj.a aVar2 : x.H0(list, i12)) {
                i11 += aVar2.f();
            }
            return f11 + i11;
        }
        throw new IndexOutOfBoundsException("ActualValue (" + d11 + ") is not in provided ranges.");
    }

    public final float c(int i11) {
        return this.f33718c.a().invoke(this, Integer.valueOf(i11), Float.valueOf(this.f33717b)).floatValue();
    }

    public final int d() {
        return this.f33719d;
    }

    public final List<zj.a> e() {
        return this.f33716a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionGraph$Spec)) {
            return false;
        }
        DistributionGraph$Spec distributionGraph$Spec = (DistributionGraph$Spec) obj;
        if (u.e(this.f33716a, distributionGraph$Spec.f33716a) && h.b(this.f33717b, distributionGraph$Spec.f33717b) && this.f33718c == distributionGraph$Spec.f33718c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33718c.hashCode() + o.a(this.f33717b, this.f33716a.hashCode() * 31, 31);
    }

    public final String toString() {
        String d11 = h.d(this.f33717b);
        return "Spec(ranges=" + this.f33716a + ", columnsMaxHeight=" + d11 + ", form=" + this.f33718c + ")";
    }
}
