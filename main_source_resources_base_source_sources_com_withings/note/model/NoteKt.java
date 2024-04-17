package com.withings.note.model;

import kotlin.Metadata;
/* compiled from: Note.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toNote", "Lcom/withings/note/model/Note;", "Lcom/withings/note/model/NoteEntity;", "note_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NoteKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.withings.note.model.Note toNote(com.withings.note.model.NoteEntity r13) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.u.j(r13, r0)
            int r0 = r13.getType()     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L7d
            r1 = 2
            if (r0 == r1) goto L47
            r1 = 3
            if (r0 != r1) goto L3f
            com.withings.note.model.NoteText r0 = new com.withings.note.model.NoteText     // Catch: java.lang.Throwable -> L3c
            long r3 = r13.getNoteId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r5 = r13.getNoteWsId()     // Catch: java.lang.Throwable -> L3c
            int r6 = r13.getType()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = r13.getText()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r8 = r13.getNoteGroupId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r9 = r13.getLocalNoteGroupId()     // Catch: java.lang.Throwable -> L3c
            boolean r10 = r13.getNoteDeleted()     // Catch: java.lang.Throwable -> L3c
            long r11 = r13.getModified()     // Catch: java.lang.Throwable -> L3c
            r2 = r0
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3c
            goto Lb6
        L3c:
            r13 = move-exception
            goto Lb2
        L3f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "Unknown note type"
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            throw r13     // Catch: java.lang.Throwable -> L3c
        L47:
            java.lang.Long r4 = r13.getNoteHealthAttributeLocalId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r0 = r13.getNoteHealthAttributeId()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L55
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L3c
        L55:
            r1 = r2
            java.lang.Long r5 = r13.getNoteWsId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r6 = r13.getNoteGroupId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r7 = r13.getLocalNoteGroupId()     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r13.getNoteDeleted()     // Catch: java.lang.Throwable -> L3c
            long r9 = r13.getModified()     // Catch: java.lang.Throwable -> L3c
            com.withings.note.model.NoteHealthAttribute r11 = new com.withings.note.model.NoteHealthAttribute     // Catch: java.lang.Throwable -> L3c
            r12 = 2
            r0 = r11
            r3 = r4
            r4 = r5
            r5 = r12
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            long r0 = r13.getNoteId()     // Catch: java.lang.Throwable -> L3c
            r11.setLocalId(r0)     // Catch: java.lang.Throwable -> L3c
        L7b:
            r0 = r11
            goto Lb6
        L7d:
            java.lang.Long r4 = r13.getNoteHealthAttributeLocalId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r0 = r13.getNoteHealthAttributeId()     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L8b
            long r2 = r0.longValue()     // Catch: java.lang.Throwable -> L3c
        L8b:
            r1 = r2
            java.lang.Long r5 = r13.getNoteWsId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r6 = r13.getNoteGroupId()     // Catch: java.lang.Throwable -> L3c
            java.lang.Long r7 = r13.getLocalNoteGroupId()     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r13.getNoteDeleted()     // Catch: java.lang.Throwable -> L3c
            long r9 = r13.getModified()     // Catch: java.lang.Throwable -> L3c
            com.withings.note.model.NoteHealthAttribute r11 = new com.withings.note.model.NoteHealthAttribute     // Catch: java.lang.Throwable -> L3c
            r12 = 1
            r0 = r11
            r3 = r4
            r4 = r5
            r5 = r12
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3c
            long r0 = r13.getNoteId()     // Catch: java.lang.Throwable -> L3c
            r11.setLocalId(r0)     // Catch: java.lang.Throwable -> L3c
            goto L7b
        Lb2:
            nm0.k$a r0 = nm0.l.a(r13)
        Lb6:
            java.lang.Throwable r13 = nm0.k.b(r0)
            if (r13 == 0) goto Lbf
            x70.b.n(r13)
        Lbf:
            boolean r13 = r0 instanceof nm0.k.a
            if (r13 == 0) goto Lc4
            r0 = 0
        Lc4:
            com.withings.note.model.Note r0 = (com.withings.note.model.Note) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.note.model.NoteKt.toNote(com.withings.note.model.NoteEntity):com.withings.note.model.Note");
    }
}
