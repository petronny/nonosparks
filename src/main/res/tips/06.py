import json
tips='06'
data={}
data['tips']=[]

line={}
line['type']='text'
line['content']='Do not forget:'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='If you know a square can not be filled, it helps to mark it with an X.'
data['tips'].append(line)

json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
