package com.withings.weight.ui.segmentalBodyCompositionScreen.model;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Pin.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/withings/weight/ui/segmentalBodyCompositionScreen/model/Pin$Style", "", "Lcom/withings/weight/ui/segmentalBodyCompositionScreen/model/Pin$Style;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Pin$Style {

    /* renamed from: d  reason: collision with root package name */
    public static final Pin$Style f47775d;

    /* renamed from: e  reason: collision with root package name */
    public static final Pin$Style f47776e;

    /* renamed from: f  reason: collision with root package name */
    public static final Pin$Style f47777f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ Pin$Style[] f47778g;

    /* renamed from: a  reason: collision with root package name */
    private final int f47779a;

    /* renamed from: b  reason: collision with root package name */
    private final float f47780b;

    /* renamed from: c  reason: collision with root package name */
    private final String f47781c;

    static {
        Pin$Style pin$Style = new Pin$Style("Dot", 0, C1987R.drawable.ic_dot, 4);
        f47775d = pin$Style;
        float f11 = 16;
        Pin$Style pin$Style2 = new Pin$Style("Minus", 1, C1987R.drawable.icon_medium_navigation_minus, f11);
        f47776e = pin$Style2;
        Pin$Style pin$Style3 = new Pin$Style("Plus", 2, C1987R.drawable.icon_medium_navigation_plus, f11);
        f47777f = pin$Style3;
        Pin$Style[] pin$StyleArr = {pin$Style, pin$Style2, pin$Style3};
        f47778g = pin$StyleArr;
        b.a(pin$StyleArr);
    }

    private Pin$Style() {
        throw null;
    }

    Pin$Style(String str, int i11, int i12, float f11) {
        this.f47779a = i12;
        this.f47780b = f11;
        this.f47781c = null;
    }

    public static Pin$Style valueOf(String str) {
        return (Pin$Style) Enum.valueOf(Pin$Style.class, str);
    }

    public static Pin$Style[] values() {
        return (Pin$Style[]) f47778g.clone();
    }

    public final String a() {
        return this.f47781c;
    }

    public final int b() {
        return this.f47779a;
    }

    public final float d() {
        return this.f47780b;
    }
}
