// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            ElGamalParameters

public class ElGamalKeyGenerationParameters extends KeyGenerationParameters
{

    public ElGamalParameters axl;

    public ElGamalKeyGenerationParameters(SecureRandom securerandom, ElGamalParameters elgamalparameters)
    {
        int i;
        if (elgamalparameters.afM != 0)
        {
            i = elgamalparameters.afM;
        } else
        {
            i = elgamalparameters.amM.bitLength();
        }
        super(securerandom, i);
        axl = elgamalparameters;
    }
}
