package com.withings.common.compose.component.bottomSheet;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PictureOptionsBottomSheetContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/bottomSheet/PictureOption;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PictureOption {

    /* renamed from: a  reason: collision with root package name */
    public static final PictureOption f33482a;

    /* renamed from: b  reason: collision with root package name */
    public static final PictureOption f33483b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ PictureOption[] f33484c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.bottomSheet.PictureOption] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.bottomSheet.PictureOption] */
    static {
        ?? r02 = new Enum("FROM_GALLERY", 0);
        f33482a = r02;
        ?? r12 = new Enum("CAMERA", 1);
        f33483b = r12;
        PictureOption[] pictureOptionArr = {r02, r12};
        f33484c = pictureOptionArr;
        b.a(pictureOptionArr);
    }

    private PictureOption() {
        throw null;
    }

    public static PictureOption valueOf(String str) {
        return (PictureOption) Enum.valueOf(PictureOption.class, str);
    }

    public static PictureOption[] values() {
        return (PictureOption[]) f33484c.clone();
    }
}
