package com.withings.manualLogging.data.webservice.note;

import fx.e;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.p;
/* compiled from: NoteWebServiceMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "measurementId", "signalId", "Lfx/e$a;", "invoke", "(JJ)Lfx/e$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class NoteWebServiceMapper$toNoteGroup$1 extends w implements p<Long, Long, e.a> {
    public static final NoteWebServiceMapper$toNoteGroup$1 INSTANCE = new NoteWebServiceMapper$toNoteGroup$1();

    NoteWebServiceMapper$toNoteGroup$1() {
        super(2);
    }

    public final e.a invoke(long j5, long j11) {
        return new e.a(j5, j11);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ e.a invoke(Long l5, Long l6) {
        return invoke(l5.longValue(), l6.longValue());
    }
}
