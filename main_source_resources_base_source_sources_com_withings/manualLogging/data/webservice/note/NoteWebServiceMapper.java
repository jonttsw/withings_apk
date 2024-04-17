package com.withings.manualLogging.data.webservice.note;

import com.withings.library.measure.MeasuresGroup;
import fx.d;
import fx.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import mx.a;
import nm0.j;
import nx.b;
import nx.k;
import org.apache.http.HttpStatus;
import ym0.l;
/* compiled from: NoteWebServiceMapper.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007J'\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/NoteWebServiceMapper;", "", "Lcom/withings/manualLogging/data/webservice/note/WebServiceCommentNote;", "Lfx/d;", "toNote", "(Lcom/withings/manualLogging/data/webservice/note/WebServiceCommentNote;)Lfx/d;", "Lcom/withings/manualLogging/data/webservice/note/WebServiceHealthAttributeNote;", "(Lcom/withings/manualLogging/data/webservice/note/WebServiceHealthAttributeNote;)Lfx/d;", "R", "Lkotlin/Function1;", "mapping", "map", "(Lym0/l;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;", "Lfx/e;", "toNoteGroup", "(Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;)Lfx/e;", "Lnx/k;", "toRoomNoteGroup", "(Lcom/withings/manualLogging/data/webservice/note/WebServiceNoteGroup;)Lnx/k;", "Ltw/a;", "measureDao", "Ltw/a;", "Lmx/a;", "healthAttributeDao", "Lmx/a;", "Lnx/b;", "noteDao", "Lnx/b;", "<init>", "(Ltw/a;Lmx/a;Lnx/b;)V", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoteWebServiceMapper {
    private final a healthAttributeDao;
    private final tw.a measureDao;
    private final b noteDao;

    public NoteWebServiceMapper(tw.a measureDao, a healthAttributeDao, b noteDao) {
        u.j(measureDao, "measureDao");
        u.j(healthAttributeDao, "healthAttributeDao");
        u.j(noteDao, "noteDao");
        this.measureDao = measureDao;
        this.healthAttributeDao = healthAttributeDao;
        this.noteDao = noteDao;
    }

    private final d toNote(WebServiceCommentNote webServiceCommentNote) {
        String text = webServiceCommentNote.getText();
        if (text != null) {
            return new fx.a(text, 0L, Long.valueOf(webServiceCommentNote.getWsId()), 2);
        }
        return null;
    }

    public final <R> R map(l<? super NoteWebServiceMapper, ? extends R> mapping) {
        u.j(mapping, "mapping");
        return mapping.invoke(this);
    }

    public final e toNoteGroup(WebServiceNoteGroup webServiceNoteGroup) {
        d dVar;
        long j5;
        u.j(webServiceNoteGroup, "<this>");
        WebServiceCommentNote webServiceCommentNote = (WebServiceCommentNote) x.K(webServiceNoteGroup.getComments());
        Long l5 = null;
        if (webServiceCommentNote != null) {
            dVar = toNote(webServiceCommentNote);
        } else {
            dVar = null;
        }
        List V = x.V(dVar);
        List<WebServiceHealthAttributeNote> medicines = webServiceNoteGroup.getMedicines();
        ArrayList arrayList = new ArrayList(x.y(medicines, 10));
        for (WebServiceHealthAttributeNote webServiceHealthAttributeNote : medicines) {
            arrayList.add(toNote(webServiceHealthAttributeNote));
        }
        ArrayList l02 = x.l0(arrayList, V);
        List<WebServiceHealthAttributeNote> symptoms = webServiceNoteGroup.getSymptoms();
        ArrayList arrayList2 = new ArrayList(x.y(symptoms, 10));
        for (WebServiceHealthAttributeNote webServiceHealthAttributeNote2 : symptoms) {
            arrayList2.add(toNote(webServiceHealthAttributeNote2));
        }
        ArrayList l03 = x.l0(arrayList2, l02);
        MeasuresGroup i11 = this.measureDao.i(webServiceNoteGroup.getRemoteMeasureGroupId());
        if (i11 != null) {
            l5 = Long.valueOf(i11.getId());
        }
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = 0;
        }
        return new e(j5, x.G(l03), webServiceNoteGroup.getNoSymptom(), (e.a) cr.a.a(new j(l5, webServiceNoteGroup.getSignalId()), NoteWebServiceMapper$toNoteGroup$1.INSTANCE), webServiceNoteGroup.getDate());
    }

    public final k toRoomNoteGroup(WebServiceNoteGroup webServiceNoteGroup) {
        long j5;
        u.j(webServiceNoteGroup, "<this>");
        MeasuresGroup i11 = this.measureDao.i(webServiceNoteGroup.getRemoteMeasureGroupId());
        long remoteMeasureGroupId = webServiceNoteGroup.getRemoteMeasureGroupId();
        Long valueOf = Long.valueOf(remoteMeasureGroupId);
        Long l5 = null;
        if (remoteMeasureGroupId <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            j5 = valueOf.longValue();
        } else {
            j5 = -555;
        }
        k s11 = this.noteDao.s(webServiceNoteGroup.getWsId());
        if (s11 != null) {
            Long userId = webServiceNoteGroup.getUserId();
            if (i11 != null) {
                l5 = Long.valueOf(i11.getId());
            }
            return k.a(s11, 0L, null, userId, j5, l5, null, webServiceNoteGroup.getCryptpart(), null, webServiceNoteGroup.getServerModifiedDate(), webServiceNoteGroup.getServerModifiedDate(), webServiceNoteGroup.getNoSymptom(), webServiceNoteGroup.getSignalId(), webServiceNoteGroup.getDeleted(), true, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE);
        }
        long wsId = webServiceNoteGroup.getWsId();
        Long userId2 = webServiceNoteGroup.getUserId();
        if (i11 != null) {
            l5 = Long.valueOf(i11.getId());
        }
        return new k(Long.valueOf(wsId), userId2, j5, l5, (Long) null, webServiceNoteGroup.getCryptpart(), webServiceNoteGroup.getDate(), webServiceNoteGroup.getServerCreatedDate(), webServiceNoteGroup.getServerModifiedDate(), webServiceNoteGroup.getServerModifiedDate(), webServiceNoteGroup.getNoSymptom(), webServiceNoteGroup.getSignalId(), webServiceNoteGroup.getDeleted(), true, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final fx.d toNote(com.withings.manualLogging.data.webservice.note.WebServiceHealthAttributeNote r22) {
        /*
            r21 = this;
            java.lang.String r0 = "Unknown healthattribute type "
            r1 = r21
            mx.a r2 = r1.healthAttributeDao
            long r3 = r22.getHealthAttributeWsId()
            mx.f r2 = r2.j(r3)
            r3 = 0
            int r4 = r22.getType()     // Catch: java.lang.Throwable -> L57
            r5 = 1
            if (r4 == r5) goto L91
            r5 = 2
            if (r4 != r5) goto L7b
            if (r2 == 0) goto L79
            long r4 = r22.getWsId()     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r2.f()     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L71
            java.lang.String r8 = r2.k()     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L69
            java.lang.String r9 = r2.g()     // Catch: java.lang.Throwable -> L57
            if (r9 == 0) goto L61
            java.lang.String r10 = r2.d()     // Catch: java.lang.Throwable -> L57
            if (r10 == 0) goto L59
            java.lang.String r11 = r2.c()     // Catch: java.lang.Throwable -> L57
            java.lang.String r12 = r2.m()     // Catch: java.lang.Throwable -> L57
            long r14 = r2.e()     // Catch: java.lang.Throwable -> L57
            java.lang.Long r16 = r2.l()     // Catch: java.lang.Throwable -> L57
            fx.f r0 = new fx.f     // Catch: java.lang.Throwable -> L57
            java.lang.Long r19 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L57
            r13 = 0
            r17 = 0
            r20 = 2496(0x9c0, float:3.498E-42)
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r19, r20)     // Catch: java.lang.Throwable -> L57
            goto Laf
        L57:
            r0 = move-exception
            goto Lab
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "An Symptom has no description default value but all should have one."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "An Symptom has no description wording key but all should have one."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L69:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "An Symptom has no name default value but all should have one."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L71:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = "An Symptom has no name wording key but all should have one."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L79:
            r0 = r3
            goto Laf
        L7b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L57
            int r4 = r22.getType()     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L57
            r5.append(r4)     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L57
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L57
            throw r2     // Catch: java.lang.Throwable -> L57
        L91:
            if (r2 == 0) goto L79
            java.lang.String r5 = r2.k()     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L79
            fx.c r0 = new fx.c     // Catch: java.lang.Throwable -> L57
            long r6 = r22.getWsId()     // Catch: java.lang.Throwable -> L57
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L57
            r9 = 2
            r6 = 0
            r4 = r0
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L57
            goto Laf
        Lab:
            nm0.k$a r0 = nm0.l.a(r0)
        Laf:
            java.lang.Throwable r2 = nm0.k.b(r0)
            if (r2 == 0) goto Lb8
            x70.b.n(r2)
        Lb8:
            boolean r2 = r0 instanceof nm0.k.a
            if (r2 == 0) goto Lbd
            goto Lbe
        Lbd:
            r3 = r0
        Lbe:
            fx.d r3 = (fx.d) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.data.webservice.note.NoteWebServiceMapper.toNote(com.withings.manualLogging.data.webservice.note.WebServiceHealthAttributeNote):fx.d");
    }
}
