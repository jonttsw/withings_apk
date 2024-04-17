package com.withings.manualLogging.core.entity.cycle;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContraceptiveType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/core/entity/cycle/ContraceptiveRegime;", "", "manual-logging-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ContraceptiveRegime {

    /* renamed from: b  reason: collision with root package name */
    public static final ContraceptiveRegime f40664b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ ContraceptiveRegime[] f40665c;

    /* renamed from: a  reason: collision with root package name */
    private final int f40666a;

    static {
        ContraceptiveRegime contraceptiveRegime = new ContraceptiveRegime("X21", 0, 21);
        f40664b = contraceptiveRegime;
        ContraceptiveRegime[] contraceptiveRegimeArr = {contraceptiveRegime, new ContraceptiveRegime("X28", 1, 28)};
        f40665c = contraceptiveRegimeArr;
        b.a(contraceptiveRegimeArr);
    }

    private ContraceptiveRegime(String str, int i11, int i12) {
        this.f40666a = i12;
    }

    public static ContraceptiveRegime valueOf(String str) {
        return (ContraceptiveRegime) Enum.valueOf(ContraceptiveRegime.class, str);
    }

    public static ContraceptiveRegime[] values() {
        return (ContraceptiveRegime[]) f40665c.clone();
    }

    public final int a() {
        return this.f40666a;
    }
}
