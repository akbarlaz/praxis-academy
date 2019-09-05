        let matriksA = [
            [1,2],
            [3,4]
        ];

        let matriksB = [
            [4,3],
            [2,1]
        ];
        
        console.log("Matriks A");
        for (j = 0; j < matriksA[0].length; j++) {
            //System.out.print("|");
            //for (i = 0; i < matriksA.length; i++) {
                console.log("["+matriksA[j]+"]");
            //}
            //System.out.print("|");            
            //console.log("\n");
        }
        
        console.log("Matriks B");
        for (j = 0; j < matriksB[0].length; j++) {
                console.log("["+matriksB[j]+"]");
        }

        console.log("Hasil penjumlahan dari matriks A dan B");
        for ( j = 0; j < matriksA.length; j++){
            
            for (i = 0; i < matriksA[0].length; i++){
                let sum = matriksA[i] + matriksB[i][j]; 
                console.log( "["+sum+"]");
            }       
            
        }