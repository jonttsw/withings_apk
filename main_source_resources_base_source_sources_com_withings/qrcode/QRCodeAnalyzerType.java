package com.withings.qrcode;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRCodeAnalyZerType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/qrcode/QRCodeAnalyzerType;", "", "a", "qrcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class QRCodeAnalyzerType {

    /* renamed from: b  reason: collision with root package name */
    public static final a f43849b;

    /* renamed from: c  reason: collision with root package name */
    public static final QRCodeAnalyzerType f43850c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ QRCodeAnalyzerType[] f43851d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f43852e;

    /* renamed from: a  reason: collision with root package name */
    private final int f43853a = 1;

    /* compiled from: QRCodeAnalyZerType.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.qrcode.QRCodeAnalyzerType$a, java.lang.Object] */
    static {
        QRCodeAnalyzerType qRCodeAnalyzerType = new QRCodeAnalyzerType();
        f43850c = qRCodeAnalyzerType;
        QRCodeAnalyzerType[] qRCodeAnalyzerTypeArr = {qRCodeAnalyzerType};
        f43851d = qRCodeAnalyzerTypeArr;
        f43852e = sm0.b.a(qRCodeAnalyzerTypeArr);
        f43849b = new Object();
    }

    private QRCodeAnalyzerType() {
    }

    public static sm0.a<QRCodeAnalyzerType> a() {
        return f43852e;
    }

    public static QRCodeAnalyzerType valueOf(String str) {
        return (QRCodeAnalyzerType) Enum.valueOf(QRCodeAnalyzerType.class, str);
    }

    public static QRCodeAnalyzerType[] values() {
        return (QRCodeAnalyzerType[]) f43851d.clone();
    }

    public final int b() {
        return this.f43853a;
    }
}
