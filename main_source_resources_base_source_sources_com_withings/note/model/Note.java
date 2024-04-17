package com.withings.note.model;

import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Note.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001BG\b\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0000H&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\bR$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0004\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u0018R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\b\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"Lcom/withings/note/model/Note;", "", "", "getWsId", "()Ljava/lang/Long;", "wsId", "Lnm0/y;", "setWsId", "(J)V", ConstantsWs.REDOX_DATA_MODEL_NOTE, "", "hasSameId", "(Lcom/withings/note/model/Note;)Z", "copy", "()Lcom/withings/note/model/Note;", "localId", "J", "getLocalId", "()J", "setLocalId", "noteGroupId", "Ljava/lang/Long;", "getNoteGroupId", "setNoteGroupId", "(Ljava/lang/Long;)V", "localNoteGroupId", "getLocalNoteGroupId", "setLocalNoteGroupId", "deleted", "Z", "getDeleted", "()Z", "setDeleted", "(Z)V", "signalId", "getSignalId", "setSignalId", "modified", "getModified", "setModified", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/Long;J)V", "Lcom/withings/note/model/NoteHealthAttribute;", "Lcom/withings/note/model/NoteText;", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class Note {
    private boolean deleted;
    private long localId;
    private Long localNoteGroupId;
    private long modified;
    @SerializedName("notegrpid")
    private Long noteGroupId;
    private Long signalId;

    public /* synthetic */ Note(long j5, Long l5, Long l6, boolean z5, Long l11, long j11, m mVar) {
        this(j5, l5, l6, z5, l11, j11);
    }

    public abstract Note copy();

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final Long getLocalNoteGroupId() {
        return this.localNoteGroupId;
    }

    public final long getModified() {
        return this.modified;
    }

    public final Long getNoteGroupId() {
        return this.noteGroupId;
    }

    public final Long getSignalId() {
        return this.signalId;
    }

    public abstract Long getWsId();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean hasSameId(Note note) {
        u.j(note, "note");
        if (this.localId != note.localId && !u.e(getWsId(), note.getWsId())) {
            return false;
        }
        return true;
    }

    public final void setDeleted(boolean z5) {
        this.deleted = z5;
    }

    public final void setLocalId(long j5) {
        this.localId = j5;
    }

    public final void setLocalNoteGroupId(Long l5) {
        this.localNoteGroupId = l5;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setNoteGroupId(Long l5) {
        this.noteGroupId = l5;
    }

    public final void setSignalId(Long l5) {
        this.signalId = l5;
    }

    public abstract void setWsId(long j5);

    private Note(long j5, Long l5, Long l6, boolean z5, Long l11, long j11) {
        this.localId = j5;
        this.noteGroupId = l5;
        this.localNoteGroupId = l6;
        this.deleted = z5;
        this.signalId = l11;
        this.modified = j11;
    }

    public /* synthetic */ Note(long j5, Long l5, Long l6, boolean z5, Long l11, long j11, int i11, m mVar) {
        this((i11 & 1) != 0 ? 0L : j5, (i11 & 2) != 0 ? null : l5, l6, (i11 & 8) != 0 ? false : z5, (i11 & 16) != 0 ? null : l11, j11, null);
    }
}
