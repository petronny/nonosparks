import json
tips='04'
data={}
data['tips']=[]

line={}
line['type']='text'
line['content']='Each number shows how long a line segment of filled squares in the current row or column there should be.'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/04.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Fill all squares as shown by the numbers.'
data['tips'].append(line)

json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
