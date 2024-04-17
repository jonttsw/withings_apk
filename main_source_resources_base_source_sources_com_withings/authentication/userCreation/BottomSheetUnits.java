package com.withings.authentication.userCreation;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserInfoNavigation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/userCreation/BottomSheetUnits;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BottomSheetUnits {

    /* renamed from: b  reason: collision with root package name */
    public static final BottomSheetUnits f32471b;

    /* renamed from: c  reason: collision with root package name */
    public static final BottomSheetUnits f32472c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ BottomSheetUnits[] f32473d;

    /* renamed from: a  reason: collision with root package name */
    private final int f32474a;

    static {
        BottomSheetUnits bottomSheetUnits = new BottomSheetUnits("HEIGHT_UNITS", 0, C1987R.string.height_unit);
        f32471b = bottomSheetUnits;
        BottomSheetUnits bottomSheetUnits2 = new BottomSheetUnits("WEIGHT_UNITS", 1, C1987R.string.weight_unit);
        f32472c = bottomSheetUnits2;
        BottomSheetUnits[] bottomSheetUnitsArr = {bottomSheetUnits, bottomSheetUnits2};
        f32473d = bottomSheetUnitsArr;
        sm0.b.a(bottomSheetUnitsArr);
    }

    private BottomSheetUnits(String str, int i11, int i12) {
        this.f32474a = i12;
    }

    public static BottomSheetUnits valueOf(String str) {
        return (BottomSheetUnits) Enum.valueOf(BottomSheetUnits.class, str);
    }

    public static BottomSheetUnits[] values() {
        return (BottomSheetUnits[]) f32473d.clone();
    }

    public final int a() {
        return this.f32474a;
    }
}
