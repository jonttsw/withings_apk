package com.withings.common.compose.component.bottomSheet;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/bottomSheet/BottomSheetType;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BottomSheetType {

    /* renamed from: b  reason: collision with root package name */
    public static final BottomSheetType f33473b;

    /* renamed from: c  reason: collision with root package name */
    public static final BottomSheetType f33474c;

    /* renamed from: d  reason: collision with root package name */
    public static final BottomSheetType f33475d;

    /* renamed from: e  reason: collision with root package name */
    public static final BottomSheetType f33476e;

    /* renamed from: f  reason: collision with root package name */
    public static final BottomSheetType f33477f;

    /* renamed from: g  reason: collision with root package name */
    public static final BottomSheetType f33478g;

    /* renamed from: h  reason: collision with root package name */
    public static final BottomSheetType f33479h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ BottomSheetType[] f33480i;

    /* renamed from: a  reason: collision with root package name */
    private final int f33481a;

    static {
        BottomSheetType bottomSheetType = new BottomSheetType(CommonConstant.RETKEY.GENDER, 0, C1987R.string.settings_profile_biological_sex);
        f33473b = bottomSheetType;
        BottomSheetType bottomSheetType2 = new BottomSheetType("PERSONAL_GENDER", 1, C1987R.string.info_personal_gender);
        f33474c = bottomSheetType2;
        BottomSheetType bottomSheetType3 = new BottomSheetType("PRONOUN", 2, C1987R.string.info_personal_pronoum);
        f33475d = bottomSheetType3;
        BottomSheetType bottomSheetType4 = new BottomSheetType("UNIT_HEIGHT", 3, C1987R.string.profile_selectHeightUnit);
        f33476e = bottomSheetType4;
        BottomSheetType bottomSheetType5 = new BottomSheetType("UNIT_WEIGHT", 4, C1987R.string.profile_selectWeightUnit);
        f33477f = bottomSheetType5;
        BottomSheetType bottomSheetType6 = new BottomSheetType("PHOTOPICKER", 5, C1987R.string.profilePicture_editPicture);
        f33478g = bottomSheetType6;
        BottomSheetType bottomSheetType7 = new BottomSheetType("DELETE_MAIN_ACCOUNT", 6, C1987R.string._SET_);
        f33479h = bottomSheetType7;
        BottomSheetType[] bottomSheetTypeArr = {bottomSheetType, bottomSheetType2, bottomSheetType3, bottomSheetType4, bottomSheetType5, bottomSheetType6, bottomSheetType7};
        f33480i = bottomSheetTypeArr;
        b.a(bottomSheetTypeArr);
    }

    private BottomSheetType(String str, int i11, int i12) {
        this.f33481a = i12;
    }

    public static BottomSheetType valueOf(String str) {
        return (BottomSheetType) Enum.valueOf(BottomSheetType.class, str);
    }

    public static BottomSheetType[] values() {
        return (BottomSheetType[]) f33480i.clone();
    }

    public final int a() {
        return this.f33481a;
    }
}
