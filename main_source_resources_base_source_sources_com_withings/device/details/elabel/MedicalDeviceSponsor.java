package com.withings.device.details.elabel;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MedicalDeviceSponsor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/details/elabel/MedicalDeviceSponsor;", "", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MedicalDeviceSponsor {

    /* renamed from: a  reason: collision with root package name */
    public static final MedicalDeviceSponsor f36806a;

    /* renamed from: b  reason: collision with root package name */
    public static final MedicalDeviceSponsor f36807b;

    /* renamed from: c  reason: collision with root package name */
    public static final MedicalDeviceSponsor f36808c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ MedicalDeviceSponsor[] f36809d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.device.details.elabel.MedicalDeviceSponsor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.device.details.elabel.MedicalDeviceSponsor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.device.details.elabel.MedicalDeviceSponsor] */
    static {
        ?? r02 = new Enum("SwitzerlandSponsor", 0);
        f36806a = r02;
        ?? r12 = new Enum("AustralianSponsor", 1);
        f36807b = r12;
        ?? r22 = new Enum("UkSponsor", 2);
        f36808c = r22;
        MedicalDeviceSponsor[] medicalDeviceSponsorArr = {r02, r12, r22};
        f36809d = medicalDeviceSponsorArr;
        sm0.b.a(medicalDeviceSponsorArr);
    }

    private MedicalDeviceSponsor() {
        throw null;
    }

    public static MedicalDeviceSponsor valueOf(String str) {
        return (MedicalDeviceSponsor) Enum.valueOf(MedicalDeviceSponsor.class, str);
    }

    public static MedicalDeviceSponsor[] values() {
        return (MedicalDeviceSponsor[]) f36809d.clone();
    }
}
