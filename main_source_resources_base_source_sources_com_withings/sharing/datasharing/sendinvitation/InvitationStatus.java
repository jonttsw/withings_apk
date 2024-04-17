package com.withings.sharing.datasharing.sendinvitation;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SendInvitationViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/sharing/datasharing/sendinvitation/InvitationStatus;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InvitationStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final InvitationStatus f44087a;

    /* renamed from: b  reason: collision with root package name */
    public static final InvitationStatus f44088b;

    /* renamed from: c  reason: collision with root package name */
    public static final InvitationStatus f44089c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ InvitationStatus[] f44090d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.sharing.datasharing.sendinvitation.InvitationStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.sharing.datasharing.sendinvitation.InvitationStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.sharing.datasharing.sendinvitation.InvitationStatus] */
    static {
        ?? r02 = new Enum("Draft", 0);
        f44087a = r02;
        ?? r12 = new Enum("Sending", 1);
        f44088b = r12;
        ?? r22 = new Enum("Sent", 2);
        f44089c = r22;
        InvitationStatus[] invitationStatusArr = {r02, r12, r22};
        f44090d = invitationStatusArr;
        sm0.b.a(invitationStatusArr);
    }

    private InvitationStatus() {
        throw null;
    }

    public static InvitationStatus valueOf(String str) {
        return (InvitationStatus) Enum.valueOf(InvitationStatus.class, str);
    }

    public static InvitationStatus[] values() {
        return (InvitationStatus[]) f44090d.clone();
    }
}
