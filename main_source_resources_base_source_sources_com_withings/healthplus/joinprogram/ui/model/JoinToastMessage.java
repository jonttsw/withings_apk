package com.withings.healthplus.joinprogram.ui.model;

import com.withings.common.compose.component.ToastStyle;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JoinToastMessage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/healthplus/joinprogram/ui/model/JoinToastMessage;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class JoinToastMessage {

    /* renamed from: c  reason: collision with root package name */
    public static final JoinToastMessage f40369c;

    /* renamed from: d  reason: collision with root package name */
    public static final JoinToastMessage f40370d;

    /* renamed from: e  reason: collision with root package name */
    public static final JoinToastMessage f40371e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ JoinToastMessage[] f40372f;

    /* renamed from: a  reason: collision with root package name */
    private final int f40373a;

    /* renamed from: b  reason: collision with root package name */
    private final ToastStyle f40374b;

    static {
        JoinToastMessage joinToastMessage = new JoinToastMessage("Capabilities", 0, C1987R.string.programsError_capabilities);
        f40369c = joinToastMessage;
        JoinToastMessage joinToastMessage2 = new JoinToastMessage("Generic", 1, C1987R.string.programsError_generic_title);
        f40370d = joinToastMessage2;
        JoinToastMessage joinToastMessage3 = new JoinToastMessage("Failure", 2, C1987R.string.programJoin_failureAlertMessage);
        f40371e = joinToastMessage3;
        JoinToastMessage[] joinToastMessageArr = {joinToastMessage, joinToastMessage2, joinToastMessage3};
        f40372f = joinToastMessageArr;
        b.a(joinToastMessageArr);
    }

    private JoinToastMessage() {
        throw null;
    }

    JoinToastMessage(String str, int i11, int i12) {
        ToastStyle toastStyle = ToastStyle.f33350c;
        this.f40373a = i12;
        this.f40374b = toastStyle;
    }

    public static JoinToastMessage valueOf(String str) {
        return (JoinToastMessage) Enum.valueOf(JoinToastMessage.class, str);
    }

    public static JoinToastMessage[] values() {
        return (JoinToastMessage[]) f40372f.clone();
    }

    public final int a() {
        return this.f40373a;
    }

    public final ToastStyle b() {
        return this.f40374b;
    }
}
