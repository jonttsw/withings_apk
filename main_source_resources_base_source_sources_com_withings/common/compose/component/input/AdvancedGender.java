package com.withings.common.compose.component.input;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedGenderFormField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/input/AdvancedGender;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdvancedGender {

    /* renamed from: c  reason: collision with root package name */
    public static final AdvancedGender f33864c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AdvancedGender[] f33865d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ a f33866e;

    /* renamed from: a  reason: collision with root package name */
    private final String f33867a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33868b;

    static {
        AdvancedGender advancedGender = new AdvancedGender(0, "NotDefined", 0, null);
        f33864c = advancedGender;
        AdvancedGender[] advancedGenderArr = {advancedGender, new AdvancedGender(1, "TransgenderFemale", C1987R.string.info_personal_gender_transgender_female, ConstantsWs.USER_ADVANCED_GENDER_TRANSGENDER_FEMALE), new AdvancedGender(2, "Male", C1987R.string._HOMME_, ConstantsWs.USER_ADVANCED_GENDER_MALE), new AdvancedGender(3, "NonBinary", C1987R.string.gender_non_binary, ConstantsWs.USER_ADVANCED_GENDER_NON_BINARY), new AdvancedGender(4, "Female", C1987R.string._FEMME_, ConstantsWs.USER_ADVANCED_GENDER_FEMALE), new AdvancedGender(5, "TransgenderMale", C1987R.string.info_personal_gender_transgender_male, ConstantsWs.USER_ADVANCED_GENDER_TRANSGENDER_MALE)};
        f33865d = advancedGenderArr;
        f33866e = b.a(advancedGenderArr);
    }

    private AdvancedGender(int i11, String str, int i12, String str2) {
        this.f33867a = str2;
        this.f33868b = i12;
    }

    public static a<AdvancedGender> a() {
        return f33866e;
    }

    public static AdvancedGender valueOf(String str) {
        return (AdvancedGender) Enum.valueOf(AdvancedGender.class, str);
    }

    public static AdvancedGender[] values() {
        return (AdvancedGender[]) f33865d.clone();
    }

    public final int b() {
        return this.f33868b;
    }

    public final String d() {
        return this.f33867a;
    }
}
