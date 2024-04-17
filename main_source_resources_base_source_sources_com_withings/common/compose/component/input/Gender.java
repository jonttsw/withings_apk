package com.withings.common.compose.component.input;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GenderFormField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/input/Gender;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Gender {

    /* renamed from: c  reason: collision with root package name */
    public static final Gender f33869c;

    /* renamed from: d  reason: collision with root package name */
    public static final Gender f33870d;

    /* renamed from: e  reason: collision with root package name */
    public static final Gender f33871e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ Gender[] f33872f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ a f33873g;

    /* renamed from: a  reason: collision with root package name */
    private final int f33874a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33875b;

    static {
        Gender gender = new Gender("NotDefined", 0, -1, 0);
        f33869c = gender;
        Gender gender2 = new Gender("Male", 1, 0, C1987R.string._HOMME_);
        f33870d = gender2;
        Gender gender3 = new Gender("Female", 2, 1, C1987R.string._FEMME_);
        f33871e = gender3;
        Gender[] genderArr = {gender, gender2, gender3};
        f33872f = genderArr;
        f33873g = b.a(genderArr);
    }

    private Gender(String str, int i11, int i12, int i13) {
        this.f33874a = i12;
        this.f33875b = i13;
    }

    public static a<Gender> a() {
        return f33873g;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) f33872f.clone();
    }

    public final int b() {
        return this.f33875b;
    }

    public final int d() {
        return this.f33874a;
    }
}
