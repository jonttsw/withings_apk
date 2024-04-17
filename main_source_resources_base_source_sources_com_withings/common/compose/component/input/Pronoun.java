package com.withings.common.compose.component.input;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PronounFormField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/input/Pronoun;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Pronoun {

    /* renamed from: c  reason: collision with root package name */
    public static final Pronoun f33887c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ Pronoun[] f33888d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ a f33889e;

    /* renamed from: a  reason: collision with root package name */
    private final String f33890a;

    /* renamed from: b  reason: collision with root package name */
    private final int f33891b;

    static {
        Pronoun pronoun = new Pronoun(0, "NotDefined", 0, null);
        f33887c = pronoun;
        Pronoun[] pronounArr = {pronoun, new Pronoun(1, "Female", C1987R.string.pronoum_feminine_she_her, ConstantsWs.USER_PRONOUN_SHE), new Pronoun(2, "Male", C1987R.string.pronoum_male_he_him, ConstantsWs.USER_PRONOUN_HE), new Pronoun(3, "Neutral", C1987R.string.pronoum_neutral_they_them, ConstantsWs.USER_PRONOUN_THEY)};
        f33888d = pronounArr;
        f33889e = b.a(pronounArr);
    }

    private Pronoun(int i11, String str, int i12, String str2) {
        this.f33890a = str2;
        this.f33891b = i12;
    }

    public static a<Pronoun> a() {
        return f33889e;
    }

    public static Pronoun valueOf(String str) {
        return (Pronoun) Enum.valueOf(Pronoun.class, str);
    }

    public static Pronoun[] values() {
        return (Pronoun[]) f33888d.clone();
    }

    public final int b() {
        return this.f33891b;
    }

    public final String d() {
        return this.f33890a;
    }
}
