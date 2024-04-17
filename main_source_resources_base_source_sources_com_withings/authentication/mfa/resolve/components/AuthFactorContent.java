package com.withings.authentication.mfa.resolve.components;

import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectFactorBottomSheet.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/authentication/mfa/resolve/components/AuthFactorContent;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class AuthFactorContent {

    /* renamed from: e  reason: collision with root package name */
    public static final AuthFactorContent f31970e;

    /* renamed from: f  reason: collision with root package name */
    public static final AuthFactorContent f31971f;

    /* renamed from: g  reason: collision with root package name */
    public static final AuthFactorContent f31972g;

    /* renamed from: h  reason: collision with root package name */
    public static final AuthFactorContent f31973h;

    /* renamed from: i  reason: collision with root package name */
    public static final AuthFactorContent f31974i;

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AuthFactorContent[] f31975j;

    /* renamed from: a  reason: collision with root package name */
    private final int f31976a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31977b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31978c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f31979d;

    static {
        AuthFactorContent authFactorContent = new AuthFactorContent("TotpContent", 0, C1987R.string.mfa_type_authenticationApp, C1987R.string.mfa_type_authenticationApp_description, 2131232742, null);
        f31970e = authFactorContent;
        AuthFactorContent authFactorContent2 = new AuthFactorContent("WhatsAppContent", 1, C1987R.string.mfa_type_whatsapp, C1987R.string.mfa_type_whatsapp_description, 2131232895, null);
        f31971f = authFactorContent2;
        AuthFactorContent authFactorContent3 = new AuthFactorContent("SmsContent", 2, C1987R.string.mfa_type_sms, C1987R.string.mfa_type_sms_description, 2131232674, null);
        f31972g = authFactorContent3;
        AuthFactorContent authFactorContent4 = new AuthFactorContent("CallContent", 3, C1987R.string.mfa_type_phoneCall, C1987R.string.mfa_type_phoneCall_description, 2131232399, null);
        f31973h = authFactorContent4;
        AuthFactorContent authFactorContent5 = new AuthFactorContent("RecoveryContent", 4, C1987R.string.mfa_type_recoveryCode, C1987R.string.mfa_type_recoveryCode_description, C1987R.drawable.icon_medium_navigation_key, Integer.valueOf((int) C1987R.color.onActionSecondary));
        f31974i = authFactorContent5;
        AuthFactorContent[] authFactorContentArr = {authFactorContent, authFactorContent2, authFactorContent3, authFactorContent4, authFactorContent5};
        f31975j = authFactorContentArr;
        sm0.b.a(authFactorContentArr);
    }

    private AuthFactorContent(String str, int i11, int i12, int i13, int i14, Integer num) {
        this.f31976a = i12;
        this.f31977b = i13;
        this.f31978c = i14;
        this.f31979d = num;
    }

    public static AuthFactorContent valueOf(String str) {
        return (AuthFactorContent) Enum.valueOf(AuthFactorContent.class, str);
    }

    public static AuthFactorContent[] values() {
        return (AuthFactorContent[]) f31975j.clone();
    }

    public final Integer a() {
        return this.f31979d;
    }

    public final int b() {
        return this.f31977b;
    }

    public final int d() {
        return this.f31978c;
    }

    public final int e() {
        return this.f31976a;
    }
}
