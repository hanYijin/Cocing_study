
      // 변수를 선언합니다.
      let output = ''
      const size = 5

      // 반복합니다.
      for (let i =1; i <= size; i++) {
        for (let j = size; j > i; j--) {
          output += ' '
        }
        for (let k = 0; k < 2 * i - 1; k++) {
          output += '*'
        }
        output += '\n'
      }

      for (let i = size -1; i > 0; i--) {
        for (let j = size; j > i; j--) {
          output += ' '
        }
        for (let k = 0; k < 2 * i - 1; k++) {
          output += '*'
        }
        output += '\n'
      }

      // 출력합니다.
      console.log(output)