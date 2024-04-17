package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WellnessProgramsAdapter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramSection;", "", "showDivider", "", "text", "", "(ZLjava/lang/String;)V", "getShowDivider", "()Z", "getText", "()Ljava/lang/String;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WellnessProgramSection {
    public static final int $stable = 0;
    private final boolean showDivider;
    private final String text;

    public WellnessProgramSection(boolean z5, String text) {
        u.j(text, "text");
        this.showDivider = z5;
        this.text = text;
    }

    public final boolean getShowDivider() {
        return this.showDivider;
    }

    public final String getText() {
        return this.text;
    }
}
