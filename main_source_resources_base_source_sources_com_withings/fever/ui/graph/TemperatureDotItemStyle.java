package com.withings.fever.ui.graph;

import ah.o;
import as.g;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import sm0.b;
import yk.h;
import ym0.p;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TemperatureDotItemStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/fever/ui/graph/TemperatureDotItemStyle;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TemperatureDotItemStyle {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39242b;

    /* renamed from: c  reason: collision with root package name */
    public static final TemperatureDotItemStyle f39243c;

    /* renamed from: d  reason: collision with root package name */
    public static final TemperatureDotItemStyle f39244d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ TemperatureDotItemStyle[] f39245e;

    /* renamed from: a  reason: collision with root package name */
    private final float f39246a;

    /* compiled from: TemperatureDotItemStyle.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TemperatureDotItemStyle.kt */
        /* renamed from: com.withings.fever.ui.graph.TemperatureDotItemStyle$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0509a extends w implements p<androidx.compose.runtime.a, Integer, y> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f39248b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f39249c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ boolean f39250d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ TemperatureDotItemStyle f39251e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f39252f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f39253g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f39254h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0509a(String str, boolean z5, boolean z11, TemperatureDotItemStyle temperatureDotItemStyle, long j5, int i11, int i12) {
                super(2);
                this.f39248b = str;
                this.f39249c = z5;
                this.f39250d = z11;
                this.f39251e = temperatureDotItemStyle;
                this.f39252f = j5;
                this.f39253g = i11;
                this.f39254h = i12;
            }

            @Override // ym0.p
            public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
                num.intValue();
                int g11 = o.g(this.f39253g | 1);
                TemperatureDotItemStyle temperatureDotItemStyle = this.f39251e;
                long j5 = this.f39252f;
                a.this.a(this.f39248b, this.f39249c, this.f39250d, temperatureDotItemStyle, j5, aVar, g11, this.f39254h);
                return y.f85009a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0186  */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.String r28, boolean r29, boolean r30, com.withings.fever.ui.graph.TemperatureDotItemStyle r31, long r32, androidx.compose.runtime.a r34, int r35, int r36) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.fever.ui.graph.TemperatureDotItemStyle.a.a(java.lang.String, boolean, boolean, com.withings.fever.ui.graph.TemperatureDotItemStyle, long, androidx.compose.runtime.a, int, int):void");
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.fever.ui.graph.TemperatureDotItemStyle$a, java.lang.Object] */
    static {
        float f11;
        f11 = g.f19541a;
        int i11 = h.C;
        TemperatureDotItemStyle temperatureDotItemStyle = new TemperatureDotItemStyle(f11, 0, "Daily");
        f39243c = temperatureDotItemStyle;
        TemperatureDotItemStyle temperatureDotItemStyle2 = new TemperatureDotItemStyle(h.i(), 1, "Monthly");
        f39244d = temperatureDotItemStyle2;
        TemperatureDotItemStyle[] temperatureDotItemStyleArr = {temperatureDotItemStyle, temperatureDotItemStyle2};
        f39245e = temperatureDotItemStyleArr;
        b.a(temperatureDotItemStyleArr);
        f39242b = new Object();
    }

    private TemperatureDotItemStyle(float f11, int i11, String str) {
        this.f39246a = f11;
    }

    public static TemperatureDotItemStyle valueOf(String str) {
        return (TemperatureDotItemStyle) Enum.valueOf(TemperatureDotItemStyle.class, str);
    }

    public static TemperatureDotItemStyle[] values() {
        return (TemperatureDotItemStyle[]) f39245e.clone();
    }

    public final float a() {
        return this.f39246a;
    }
}
