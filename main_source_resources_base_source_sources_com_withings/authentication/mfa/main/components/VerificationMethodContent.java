package com.withings.authentication.mfa.main.components;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationMethodComponent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/main/components/VerificationMethodContent;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VerificationMethodContent {

    /* renamed from: e  reason: collision with root package name */
    public static final VerificationMethodContent f31642e;

    /* renamed from: f  reason: collision with root package name */
    public static final VerificationMethodContent f31643f;

    /* renamed from: g  reason: collision with root package name */
    public static final VerificationMethodContent f31644g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ VerificationMethodContent[] f31645h;

    /* renamed from: a  reason: collision with root package name */
    private final int f31646a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f31647b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f31648c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31649d;

    static {
        VerificationMethodContent verificationMethodContent = new VerificationMethodContent("WhatsAppContent", 0, C1987R.string.mfa_type_whatsapp, null, null, 2131232895);
        f31642e = verificationMethodContent;
        VerificationMethodContent verificationMethodContent2 = new VerificationMethodContent("SmsContent", 1, C1987R.string.mfa_type_sms, Integer.valueOf((int) C1987R.string.mfa_setup_phoneBased_activate_chooseMethod_smsPhoneMandatory), Integer.valueOf((int) C1987R.string.mfa_setup_phoneBased_activate_chooseMethod_smsPhoneNotAvailable), 2131232674);
        f31643f = verificationMethodContent2;
        VerificationMethodContent verificationMethodContent3 = new VerificationMethodContent("CallContent", 2, C1987R.string.mfa_type_phoneCall, Integer.valueOf((int) C1987R.string.mfa_setup_phoneBased_activate_chooseMethod_smsPhoneMandatory), Integer.valueOf((int) C1987R.string.mfa_setup_phoneBased_activate_chooseMethod_smsPhoneNotAvailable), 2131232399);
        f31644g = verificationMethodContent3;
        VerificationMethodContent[] verificationMethodContentArr = {verificationMethodContent, verificationMethodContent2, verificationMethodContent3};
        f31645h = verificationMethodContentArr;
        sm0.b.a(verificationMethodContentArr);
    }

    private VerificationMethodContent(String str, int i11, int i12, Integer num, Integer num2, int i13) {
        this.f31646a = i12;
        this.f31647b = num;
        this.f31648c = num2;
        this.f31649d = i13;
    }

    public static VerificationMethodContent valueOf(String str) {
        return (VerificationMethodContent) Enum.valueOf(VerificationMethodContent.class, str);
    }

    public static VerificationMethodContent[] values() {
        return (VerificationMethodContent[]) f31645h.clone();
    }

    public final Integer a() {
        return this.f31648c;
    }

    public final Integer b() {
        return this.f31647b;
    }

    public final int d() {
        return this.f31649d;
    }

    public final int e() {
        return this.f31646a;
    }
}
