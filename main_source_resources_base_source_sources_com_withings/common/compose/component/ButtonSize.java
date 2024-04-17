package com.withings.common.compose.component;

import androidx.compose.ui.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Buttons.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/ButtonSize;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ButtonSize {

    /* renamed from: d  reason: collision with root package name */
    public static final ButtonSize f33302d;

    /* renamed from: e  reason: collision with root package name */
    public static final ButtonSize f33303e;

    /* renamed from: f  reason: collision with root package name */
    public static final ButtonSize f33304f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ ButtonSize[] f33305g;

    /* renamed from: a  reason: collision with root package name */
    private final r0.w f33306a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.compose.ui.e f33307b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33308c;

    static {
        r0.x g11 = l.g();
        e.a aVar = androidx.compose.ui.e.f8927a;
        ButtonSize buttonSize = new ButtonSize("Default", 0, g11, androidx.compose.foundation.layout.e1.e(aVar, 1.0f), 1);
        f33302d = buttonSize;
        ButtonSize buttonSize2 = new ButtonSize("Secondary", 1, l.i(), androidx.compose.foundation.layout.e1.v(aVar, null, 3), 1);
        f33303e = buttonSize2;
        ButtonSize buttonSize3 = new ButtonSize("Mini", 2, l.h(), androidx.compose.foundation.layout.e1.h(androidx.compose.foundation.layout.e1.v(aVar, null, 3), 24, 0.0f, 2), 2);
        f33304f = buttonSize3;
        ButtonSize[] buttonSizeArr = {buttonSize, buttonSize2, buttonSize3};
        f33305g = buttonSizeArr;
        sm0.b.a(buttonSizeArr);
    }

    private ButtonSize(String str, int i11, r0.x xVar, androidx.compose.ui.e eVar, int i12) {
        this.f33306a = xVar;
        this.f33307b = eVar;
        this.f33308c = i12;
    }

    public static ButtonSize valueOf(String str) {
        return (ButtonSize) Enum.valueOf(ButtonSize.class, str);
    }

    public static ButtonSize[] values() {
        return (ButtonSize[]) f33305g.clone();
    }

    public final int a() {
        return this.f33308c;
    }

    public final r0.w b() {
        return this.f33306a;
    }

    public final androidx.compose.ui.e d() {
        return this.f33307b;
    }
}
