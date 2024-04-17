package com.withings.note.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Note.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\u0018\u0000 ,2\u00020\u0001:\u0001,B_\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\r\u0012\b\b\u0002\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lcom/withings/note/model/NoteText;", "Lcom/withings/note/model/Note;", "", "wsId", "Lnm0/y;", "setWsId", "(J)V", "getWsId", "()Ljava/lang/Long;", "copy", "()Lcom/withings/note/model/NoteText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "noteId", "J", "getNoteId", "()J", "setNoteId", "Ljava/lang/Long;", "type", "I", "getType", "setType", "(I)V", "text", "Ljava/lang/String;", "getText", "setText", "(Ljava/lang/String;)V", "noteGroupId", "localNoteGroupId", "deleted", "modified", "<init>", "(JLjava/lang/Long;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ZJ)V", "Companion", "note_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NoteText extends Note {
    public static final Companion Companion = new Companion(null);
    public static final int NOTE_TYPE_TEXT = 3;
    private long noteId;
    private String text;
    private int type;
    @SerializedName("id")
    private Long wsId;

    /* compiled from: Note.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/note/model/NoteText$Companion;", "", "()V", "NOTE_TYPE_TEXT", "", "note_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public NoteText() {
        this(0L, null, 0, null, null, null, false, 0L, 255, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoteText)) {
            return false;
        }
        NoteText noteText = (NoteText) obj;
        if (hasSameId(noteText) && u.e(noteText.text, this.text)) {
            return true;
        }
        return false;
    }

    public final long getNoteId() {
        return this.noteId;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    @Override // com.withings.note.model.Note
    public Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        return 0;
    }

    public final void setNoteId(long j5) {
        this.noteId = j5;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(int i11) {
        this.type = i11;
    }

    @Override // com.withings.note.model.Note
    public void setWsId(long j5) {
        this.wsId = Long.valueOf(j5);
    }

    public String toString() {
        int i11 = this.type;
        Long signalId = getSignalId();
        Long noteGroupId = getNoteGroupId();
        Long localNoteGroupId = getLocalNoteGroupId();
        String str = this.text;
        Long l5 = this.wsId;
        return "NoteText : type = " + i11 + ", signalId = " + signalId + ", noteGroupId = " + noteGroupId + ", localNoteGroupId = " + localNoteGroupId + ",text = " + str + ", wsId = " + l5;
    }

    public /* synthetic */ NoteText(long j5, Long l5, int i11, String str, Long l6, Long l11, boolean z5, long j11, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0L : j5, (i12 & 2) != 0 ? null : l5, (i12 & 4) != 0 ? 3 : i11, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : l6, (i12 & 32) == 0 ? l11 : null, (i12 & 64) != 0 ? false : z5, (i12 & 128) == 0 ? j11 : 0L);
    }

    @Override // com.withings.note.model.Note
    public NoteText copy() {
        return new NoteText(this.noteId, this.wsId, this.type, this.text, getNoteGroupId(), getLocalNoteGroupId(), getDeleted(), getModified());
    }

    public NoteText(long j5, Long l5, int i11, String str, Long l6, Long l11, boolean z5, long j11) {
        super(j5, l6, l11, z5, null, j11, 16, null);
        this.noteId = j5;
        this.wsId = l5;
        this.type = i11;
        this.text = str;
    }
}
