// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;


// Referenced classes of package o:
//            jd, mq, ms, mt, 
//            ig

final class il extends jd
{

    private ig Gp;

    il(ig ig)
    {
        Gp = ig;
        super();
    }

    public final Object read(mq mq1)
    {
        if (mq1._mth13A2() == ms.JO)
        {
            mq1.nextNull();
            return null;
        } else
        {
            return Long.valueOf(mq1.nextLong());
        }
    }

    public final void write(mt mt1, Object obj)
    {
        obj = (Number)obj;
        if (obj == null)
        {
            mt1._mth14F7();
            return;
        } else
        {
            mt1._mth1421(obj.toString());
            return;
        }
    }
}
