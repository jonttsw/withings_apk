package com.withings.cycletracking.ui.graph.model;

import ah.o;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import sm0.b;
import yk.h;
import ym0.p;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleTrackingDotItemStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/cycletracking/ui/graph/model/CycleTrackingDotItemStyle;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CycleTrackingDotItemStyle {

    /* renamed from: c  reason: collision with root package name */
    public static final a f35562c;

    /* renamed from: d  reason: collision with root package name */
    public static final CycleTrackingDotItemStyle f35563d;

    /* renamed from: e  reason: collision with root package name */
    public static final CycleTrackingDotItemStyle f35564e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ CycleTrackingDotItemStyle[] f35565f;

    /* renamed from: a  reason: collision with root package name */
    private final float f35566a;

    /* renamed from: b  reason: collision with root package name */
    private final float f35567b;

    /* compiled from: CycleTrackingDotItemStyle.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CycleTrackingDotItemStyle.kt */
        /* renamed from: com.withings.cycletracking.ui.graph.model.CycleTrackingDotItemStyle$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0471a extends w implements p<androidx.compose.runtime.a, Integer, y> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f35569b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f35570c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f35571d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ CycleTrackingDotItemStyle f35572e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f35573f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f35574g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f35575h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0471a(String str, boolean z5, boolean z11, CycleTrackingDotItemStyle cycleTrackingDotItemStyle, long j5, int i11, int i12) {
                super(2);
                this.f35569b = str;
                this.f35570c = z5;
                this.f35571d = z11;
                this.f35572e = cycleTrackingDotItemStyle;
                this.f35573f = j5;
                this.f35574g = i11;
                this.f35575h = i12;
            }

            @Override // ym0.p
            public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
                num.intValue();
                int g11 = o.g(this.f35574g | 1);
                CycleTrackingDotItemStyle cycleTrackingDotItemStyle = this.f35572e;
                long j5 = this.f35573f;
                a.this.a(this.f35569b, this.f35570c, this.f35571d, cycleTrackingDotItemStyle, j5, aVar, g11, this.f35575h);
                return y.f85009a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.String r28, boolean r29, boolean r30, com.withings.cycletracking.ui.graph.model.CycleTrackingDotItemStyle r31, long r32, androidx.compose.runtime.a r34, int r35, int r36) {
            /*
                Method dump skipped, instructions count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.ui.graph.model.CycleTrackingDotItemStyle.a.a(java.lang.String, boolean, boolean, com.withings.cycletracking.ui.graph.model.CycleTrackingDotItemStyle, long, androidx.compose.runtime.a, int, int):void");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.cycletracking.ui.graph.model.CycleTrackingDotItemStyle$a, java.lang.Object] */
    static {
        float f11;
        float f12;
        f11 = dn.a.f63980a;
        CycleTrackingDotItemStyle cycleTrackingDotItemStyle = new CycleTrackingDotItemStyle(f11, h.a(), 0, "Daily");
        f35563d = cycleTrackingDotItemStyle;
        float i11 = h.i();
        f12 = dn.a.f63981b;
        CycleTrackingDotItemStyle cycleTrackingDotItemStyle2 = new CycleTrackingDotItemStyle(i11, f12, 1, "Monthly");
        f35564e = cycleTrackingDotItemStyle2;
        CycleTrackingDotItemStyle[] cycleTrackingDotItemStyleArr = {cycleTrackingDotItemStyle, cycleTrackingDotItemStyle2};
        f35565f = cycleTrackingDotItemStyleArr;
        b.a(cycleTrackingDotItemStyleArr);
        f35562c = new Object();
    }

    private CycleTrackingDotItemStyle(float f11, float f12, int i11, String str) {
        this.f35566a = f11;
        this.f35567b = f12;
    }

    public static CycleTrackingDotItemStyle valueOf(String str) {
        return (CycleTrackingDotItemStyle) Enum.valueOf(CycleTrackingDotItemStyle.class, str);
    }

    public static CycleTrackingDotItemStyle[] values() {
        return (CycleTrackingDotItemStyle[]) f35565f.clone();
    }

    public final float a() {
        return this.f35567b;
    }

    public final float b() {
        return this.f35566a;
    }
}
