package com.withings.cycletracking.ui.viewmodel;

import java.util.Iterator;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
/* compiled from: VerticalCalendarPeriodLogViewModel.kt */
/* loaded from: classes3.dex */
public final class x implements Iterator<LocalDate>, zm0.a {

    /* renamed from: a  reason: collision with root package name */
    private LocalDate f35966a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ en0.g<LocalDate> f35967b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(en0.g<LocalDate> gVar) {
        this.f35967b = gVar;
        this.f35966a = gVar.getStart();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f35966a.compareTo((ReadablePartial) this.f35967b.j()) <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final LocalDate next() {
        LocalDate localDate = this.f35966a;
        LocalDate plusDays = localDate.plusDays(1);
        kotlin.jvm.internal.u.i(plusDays, "plusDays(...)");
        this.f35966a = plusDays;
        return localDate;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
